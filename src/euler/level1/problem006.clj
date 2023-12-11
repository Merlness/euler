(ns euler.level1.problem006)
(defn square [n] (* n n))

(defn square-to-sum [n]
  (apply + (map #(square %) (range (inc n)))))

(defn sum-to-square [n]
  (let [sum (apply + (range (inc n)))]
    (square sum)))

(defn euler-6 [n]
  (let [sum (sum-to-square n)
        sq  (square-to-sum n)]
    (- sum sq)))
