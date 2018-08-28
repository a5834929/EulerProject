;https://projecteuler.net/problem=4
(defn palindrome [x]
  (= (str x) (clojure.string/reverse (str x))))

(defn problem4 []
  (apply max (filter palindrome (for [x (range 100 1000) y (range 100 1000) :when (>= y x)] (* x y)))))