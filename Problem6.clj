;https://projecteuler.net/problem=6
(defn square [x]
  (* x x))

(defn problem6 []
  (- (square (reduce + (range 101))) (reduce + (map square (range 101)))))