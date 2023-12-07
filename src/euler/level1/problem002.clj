(ns euler.level1.problem002)

(defn sum [nums] (apply + nums))

(defn fib [max]
  (loop [fibs [2 1]]
    (let [next (sum (take 2 fibs))]
      (if (> next max)
        fibs
        (recur (cons next fibs))))))

(defn sum-even-fibs [max]
  (->> (fib max)
       (filter even?)
       sum))

(defn euler-2 [max-value]
  (if (> 2 max-value)
    0
    (sum-even-fibs max-value)))
