(ns euler.level1.problem007)

(defn divisible? [num x]
  (= 0 (mod num x)))

(defn prime? [num primes]
  (not-any? #(divisible? num %) primes)
  )

(defn euler-7 [position]
  (loop [num 3
         primes [2]]
    (cond
      (= position (count primes)) (last primes)
      (prime? num primes) (recur (inc num) (conj primes num))
      :else (recur (inc num) primes))))
