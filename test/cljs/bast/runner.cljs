(ns bast.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [bast.core-test]))

(doo-tests 'bast.core-test)
