(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"

  (it "finds SCD 2" (should= 2 (euler-5 2)))
  (it "finds SCD 3" (should= 6 (euler-5 3)))
  (it "finds SMD 4" (should= 12 (euler-5 4)))
  (it "finds SMD 5" (should= 60 (euler-5 5)))
  (it "finds SMD 6" (should= 60 (euler-5 6)))
  (it "finds SMD 10" (should= 2520 (euler-5 10)))
  (it "finds SMD 20" (should= 232792560 (euler-5 20)))

  )

(run-specs)
