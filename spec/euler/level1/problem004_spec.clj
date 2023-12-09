(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"
  (it "One is a palindrome" (should= true (palindrome? 1)))
  (it "100 isn't a palindrome"(should= false (palindrome? 100)))
  (it "9009 is a palindrome" (should= true (palindrome? 9009)))

  (it "finds largest 1 digit pali" (should= 9 (euler-4 1 10)))
  (it "finds largest 2 digit pali" (should= 9009 (euler-4 10 100)))
  (it "Solves #4"
    (should= 906609 (euler-4 100 1000)))

  )

(run-specs)
