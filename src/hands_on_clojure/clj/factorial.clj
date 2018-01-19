(defn factorial
  ([num]
   (factorial num 1))
  ([num result]
    (if (= num 1)
      result
      (factorial (- num 1) (* result num)))))

(factorial 9)
