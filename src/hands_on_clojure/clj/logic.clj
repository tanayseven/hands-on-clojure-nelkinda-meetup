; Even odd
(defn print-yes-if-is-odd-else-no
  [num]
  (do
    (if (odd? num)
      (println "yes")
      (println "no"))))
(defn print-yes-if-is-even-else-no
  [num]
  (do
    (if (even? num)
      (println "yes")
      (println "no"))))
(print-yes-if-is-odd-else-no 9)
(print-yes-if-is-even-else-no 10)
