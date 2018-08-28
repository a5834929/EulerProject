;https://projecteuler.net/problem=2
(defn isEven [x]
	(if (even? x) 1
		0))

(defn problem2 []
  (loop [n1 1 n2 2 sum 2]
    (let [fibo (+ n1 n2) ind (isEven fibo)]
      (if (> fibo 4000000)
        sum 
        (recur n2 fibo (+ (* ind fibo) sum))))))
