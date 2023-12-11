(ns euler.level1.problem006-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem006 :refer :all]))

; https://projecteuler.net/problem=6

(describe "Euler Problem #6"

  (it "finds SSD 2"     (should= 4 (euler-6 2)))
  (it "finds SSD 3"     (should= 22 (euler-6 3)))
  (it "finds SSD 4"     (should= 70 (euler-6 4)))
  (it "finds SSD 5"     (should= 170 (euler-6 5)))
  (it "finds SSD 10"    (should= 2640 (euler-6 10)))
  (it "finds SSD 100"   (should= 25164150 (euler-6 100)))


  )

(run-specs)
