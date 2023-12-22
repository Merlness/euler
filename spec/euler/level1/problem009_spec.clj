(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

; https://projecteuler.net/problem=9

(describe "Euler Problem #9"

  (it "finds a square"
    (should= 9 (square 3)))

  (it "knows there are 3 different numbers"
    (should= true (different? [1 2 3])))

  (it "knows if numbers are the same"
    (should= false (different? [2 2 3])))

  (it "knows if 3 numbers sum to 1000"
    (should= true (sum-thousand? [1000 0 0])))

  (it "knows if 3 numbers don't sum to 1000"
    (should= false (sum-thousand? [1000 1 0])))

  (it "knows a pythagorean triplet"
    (should= true (pythagorean-triplet? [3 4 5])))

  (it "knows another pythagorean triplet"
    (should= true (pythagorean-triplet? [5 12 13])))

  (it "knows a false pythagorean triplet"
    (should= false (pythagorean-triplet? [2 3 4])))

  (it "solves #9"
    (should= 31875000 (euler-9)))

  )
