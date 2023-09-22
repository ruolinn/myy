(ns myy.core
  (:require [reagent.core :as r]
            [reagent.dom :as rd]
            ["@mui/joy" :as joy]))

(defn login []
  [:> joy/Select
   [:> joy/Option 1]])


(defn init []
  (rd/render [login] (js/document.getElementById "root")))

