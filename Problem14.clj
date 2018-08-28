;https://projecteuler.net/problem=14
(defn collatz [x len]
  (cond (= 1 x) len
        (even? x) (recur (/ x 2) (inc len))
        (odd? x) (recur (inc (* x 3)) (inc len))))

(defn problem14 [x]
  (loop [cur x ans x len 0]
    (let [curlen (collatz cur 1)]
      (cond (= cur 1) ans
            (< len curlen) (recur (dec cur) cur curlen)
            :default (recur (dec cur) ans len)))))