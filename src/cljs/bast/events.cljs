(ns bast.events
  (:require [re-frame.core :as re-frame]
            [bast.db :as db]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))
