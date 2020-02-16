# create-reframe-app
My initial template for the [Re-frame](https://github.com/day8/re-frame) web application.

## Long story short
This template is mainly based on the following well-known repo: [re-frame-template](https://github.com/day8/re-frame-template).
Follow it at first and only then compare your configured repo with mine 🤝.

I am using the config consisting of:
* Styling: [Garden](https://github.com/noprompt/garden)
* Devtools: [Re-frame-10x](https://github.com/day8/re-frame-10x)
* REPL: [Cider](https://github.com/clojure-emacs/cider)
* Linter: [Clj-kondo](https://github.com/borkdude/clj-kondo)
* Formatting: [Cljfmt](https://github.com/weavejester/cljfmt)
* Testing: [Cljs.test](https://github.com/clojure/clojurescript/blob/master/src/main/cljs/cljs/test.cljs)
* Routing: [Bidi](https://github.com/juxt/bidi) with [Pushy](https://github.com/kibu-australia/pushy)

## Several words on my dev environment
I use [IntelliJ IDEA](https://www.jetbrains.com/idea/) with [ClojureKit plugin](https://plugins.jetbrains.com/plugin/8636-clojure-kit).
It is a smooth setup with an opportunity to integrate [Clj-kondo](https://github.com/borkdude/clj-kondo) (read its Github docs) via [LSP Server Plugin](https://plugins.jetbrains.com/plugin/10209-lsp-support).
