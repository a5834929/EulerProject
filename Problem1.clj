;https://projecteuler.net/problem=1
(defn multiples3and5 [x]
	(cond (= 0 (rem x 3)) 1
				(= 0 (rem x 5)) 1
				:else 0))

(defn problem1 [x]
	(loop [x (- x 1) sum 0]
		(let [ind (multiples3and5 x)]
				(if (= 0 x) sum
						(recur (dec x) (+ sum (* ind x)))))))