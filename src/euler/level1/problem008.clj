(ns euler.level1.problem008)

(defn num->coll [n]
  (map #(Character/digit % 10) (str n)))

(defn product [n coll]
  (reduce * (take n coll)))

(defn euler-8 [n num]
    (loop [coll (num->coll num)
           products []]
      (if (empty? coll)
        (apply max products)
        (recur (rest coll)
               (cons (product n coll) products)))))
