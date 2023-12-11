(ns euler.level1.problem005)

(defn euler-5 [n]
  (loop [holder n
         SMD 1]
    (cond
      (= 1 holder) SMD
      (not= 0 (mod SMD holder)) (recur n (inc SMD))
      :else (recur (dec holder) SMD)
      )
    ))
