;https://projecteuler.net/problem=9
(defn square [x]
  (* x x))

(defn problem9 []
  (loop [a 1 b 2 c 997]
    (cond (= (square c) (+ (square a) (square b))) (* a b c)
          (< c b) (recur (inc a) (+ a 2) (- 1000 a 3))
          :default (recur a (inc b) (- 1000 a b 1)))))


