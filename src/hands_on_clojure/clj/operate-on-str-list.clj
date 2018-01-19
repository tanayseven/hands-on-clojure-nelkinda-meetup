(defn operate-on-str-list
  [list-of-str]
  (reduce +
    (filter #(odd? %)
      (map #(read-string %)
        list-of-str))))



(def test-list '("1" "2" "3" "4" "5"))
(operate-on-str-list test-list)

; Step 1 map
(map #(read-string %) test-list)

;Step 2 filter
(filter #(odd? %) '(1 2 3 4 5))

;Step 3 sum
(reduce + '(1 3 5))
