(ns app.core
  (:require-macros [secretary.core :refer [defroute]])
  (:require [goog.events :as events]
            [reagent.core :as reagent]
            [re-frame.core :as rf :refer [dispatch dispatch-sync]]
            [secretary.core :as secretary]
            [devtools.core :as devtools]
            [app.views])
  (:import [goog History]
           [goog.history EventType]))


;; -- Debugging aids ----------------------------------------------------------
(devtools/install!)       ;; CLJS Devtools: https://github.com/binaryage/cljs-devtools
(enable-console-print!)   ;; so that println writes to `console.log`


;; -- Routes and History ------------------------------------------------------
;; Link to the repo: https://github.com/clj-commons/secretary is used
;;
(defroute "/" [] (println "Hello World!"))

(defonce history
  (doto (History.)
    (events/listen EventType.NAVIGATE
                   (fn [event] (secretary/dispatch! (.-token event))))
    (.setEnabled true)))


;; -- Entry Point -------------------------------------------------------------

(defn render
  []
  ;; Render the UI into the HTML's <div id="app" /> element
  ;; The view function `app.views/hello-world` is the
  ;; root view for the entire UI.
  (reagent/render [app.views/hello-world]
                  (.getElementById js/document "app")))

(defn ^:dev/after-load clear-cache-and-render!
  []
  ;; The `:dev/after-load` metadata causes this function to be called
  ;; after shadow-cljs hot-reloads code. We force a UI update by clearing
  ;; the Reframe subscription cache.
  (rf/clear-subscription-cache!)
  (render))

(defn ^:export main
  []
  (render))
