(ns euler.level1.problem009)

(defn square [n] (* n n))

(defn different? [[a b c]]
  (and (not= a b)
       (not= b c)
       (not= a c)))

(defn sum-thousand? [[a b c]]
  (= 1000 (reduce + [a b c])))

(defn pythagorean-triplet? [[a b c]]
  (= (+ (square a) (square b)) (square c)))

(defn euler-9 []
  (->> (for [a (range 1 500)
             b (range a 750)
             c (range b 999)
             :let [triplet [a b c]]
             :when (and (different? triplet)
                        (sum-thousand? triplet)
                        (pythagorean-triplet? triplet))]
         triplet)
       (map #(apply * %))
       first))
