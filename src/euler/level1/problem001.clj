(ns euler.level1.problem001)

(defn euler-1 [n]
  (->> (range n)
       (filter #(or (= 0 (rem % 3)) (= 0 (rem % 5))))
       (apply +)))
