(ns my-website.views
    (:require [re-frame.core :as re-frame]
              [my-website.routes :as routes]
              [my-website.subs :as subs]))

;; --------------------
(defn home-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    (fn []
      [:div (str "Hello from " @name ". This is the Home Page.")
       [:div [:a {:href (routes/url :about)} "go to About Page"]]])))

(defn about-panel []
  (fn []
    [:div "This is the About Page."
     [:div [:a {:href (routes/url ::subs/home)} "go to Home Page"]]]))

;; --------------------
(defmulti panels identity)
(defmethod panels :home-panel [] [home-panel])
(defmethod panels :about-panel [] [about-panel])
(defmethod panels :default [] [:div])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    (fn []
      (panels @active-panel))))