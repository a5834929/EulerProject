;https://projecteuler.net/problem=39
(defn is-right [a b c]
  (= (* c c) (+ (* a a) (* b b))))

(defn rightTriangle [x]
  (loop [a 1 b 1 c (- x 2) cnt 0]
    (let [inc-cnt (if (is-right a b c) (inc cnt) cnt)]
      (cond (and (= a b) (< c (+ b 2))) cnt
            (> b (- c 3)) (recur (inc a) (inc a) (- x a a 2) inc-cnt)
            :default (recur a (inc b) (dec c) inc-cnt)))))

(defn problem39 [x]
  (loop [cur x ans x cnt 0]
    (let [curCnt (rightTriangle cur)]
      (cond (= cur 3) ans
            (< cnt curCnt) (recur (dec cur) cur curCnt)
            :default (recur (dec cur) ans cnt)))))