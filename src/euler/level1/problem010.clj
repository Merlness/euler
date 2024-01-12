(ns euler.level1.problem010)

(defn divisible? [num x]
  (= 0 (mod num x)))

(defn prime? [num primes]
  (let [primes<sqrt (filter #(<= % (Math/sqrt num)) primes)]
    (not-any? #(divisible? num %) primes<sqrt)))

(defn euler-10 [n]
  (loop [num 3
         primes [2]]
    (cond
      (prime? num primes) (recur (inc num) (conj primes num))
      (<= n (last primes)) (reduce + (drop-last primes))
      :else (recur (inc num) primes))))


(defn sieve-of-Eratosthenes [n]
  (loop [primes (vec (range 2 n))
         num 2
         limit (Math/sqrt n)]
    (if (<= num limit)
      (let [non-primes (set (range (* 2 num) n num))]
        (recur  (vec (remove non-primes primes)) (inc num) limit))
      (reduce + primes))))


(comment
;; Eratosthenes
  (defn sieve-of-Eratosthenes [n]
    (loop [primes (range 2 n)
           num 2
           limit (Math/sqrt n)]

      (if (<= num limit)
        (do
          (let [non-primes (range num n num)]
            (recur (remove (set non-primes) primes) (inc num) limit)))
        (reduce + primes))
      )))

;Finished in 18.64898 seconds
    ;Finished in 3907.94172 seconds
