(ns hello.core
  (:require [malli.core :as m]
            [malli.dev.cljs :as md]))

(enable-console-print!)

(def non-empty-string (m/schema [:string {:min 1}]))

(defn a-function
  {:malli/schema [:=> [:cat :int] :string]}
  [x]
  (str x))

(md/start!)

(defn ^:export init []
  (println "init!")
  ;(js/setTimeout (a-function "500") 500)
  )
