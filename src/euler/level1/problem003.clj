(ns euler.level1.problem003)

(defn euler-3 [n]
  (loop [n n
         divisor 2]
    (cond
      (= n divisor) divisor
      (= 0 (mod n divisor)) (recur (/ n divisor) divisor)
      :else (recur n (inc divisor)))))
