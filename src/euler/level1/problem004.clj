(ns euler.level1.problem004)

(defn palindrome? [n]
  (= (str n) (apply str (reverse (str n)))))

(defn euler-4 [start end]
  (loop [i start
         j start
         max-palindrome 0]
    (if (< i end)
      (if (< j end)
        (let [product (* i j)]
          (if (and (palindrome? product) (> product max-palindrome))
            (recur i (inc j) product)
            (recur i (inc j) max-palindrome)))
        (recur (inc i) i max-palindrome))
      max-palindrome)))

