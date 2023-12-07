(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

  (it "one"
    (should= 0 (euler-2 1)))

  (it "two"
    (should= 2 (euler-2 2)))

  (it "max 8 total 10"
    (should= 10 (euler-2 8)))

  (it "max 37 total 44"
    (should= 44 (euler-2 37)))

  (it "four-million"
    (should= 4613732 (euler-2 4000000)))
  )
