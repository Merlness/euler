(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"

  (it "finds 1st prime"     (should= 2 (euler-7 1)))
  (it "finds 2nd prime"     (should= 3 (euler-7 2)))
  (it "finds 6nd prime"     (should= 13 (euler-7 6)))
  (it "finds 10001 prime"   (should= 104743 (euler-7 10001))))

