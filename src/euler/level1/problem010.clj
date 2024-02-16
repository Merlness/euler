(ns euler.level1.problem010)

(defn divisible? [num x]
  (= 0 (mod num x)))

(defn prime? [num primes]
  (let [primes<sqrt (filter #(<= % (Math/sqrt num)) primes)]
    (not-any? #(divisible? num %) primes<sqrt)))

(defn products-list-from [num n]
  (set (range (* 2 num) n num)))

(defn square-plus [num n]
  (let [square (* num num)]
    (loop [non-primes []
           new-number square]
      (if (>= new-number n)
        (set non-primes)
        (recur (conj non-primes new-number) (+ new-number num))))))

(defn sieve-of-Eratosthenes [n]
  (let [limit (Math/sqrt n)]
    (loop [primes (range 2 n)
           index 0]
      (if (<= (nth primes index) limit)
        (let [num (nth primes index)
              non-primes (products-list-from num n)
              primes (vec (remove non-primes primes))]
          (recur primes (inc index)))
        primes))))

; A = (set (range 2 n))
; for [i (range 2 (sqrt n))]
;   if (A i)
;      signma i^2 + xi, 0 <= x <= up to n
;this in products list from
(defn euler-10 [n]
  (reduce + (sieve-of-Eratosthenes n)))
