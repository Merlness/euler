(ns euler.level1.problem003-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem003 :refer :all]))

; https://projecteuler.net/problem=3

(describe "Euler Problem #3"

  (it "LPF of 4" (should= 2 (euler-3 8)))
  (it "LPF of 12" (should= 3 (euler-3 12)))
  (it "LPF of 20" (should= 5 (euler-3 20)))
  (it "LPF of 21" (should= 7 (euler-3 21)))
  (it "LPF of 10267" (should= 19 (euler-3 10260)))

  (it "Solves #3"
    (should= 6857 (euler-3  600851475143)))
  )

(run-specs)
