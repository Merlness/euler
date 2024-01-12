(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem010 :refer :all]))

; https://projecteuler.net/problem=10

(describe "Euler Problem #10"

  (it "checks for divisible numbers"
    (should= true (divisible? 4 2)))

  (it "checks for if numbers aren't divisible"
    (should= false (divisible? 5 2)))

  (it "checks if a number is prime"
    (should= true (prime? 3 [2])))

  (it "checks if a number isn't prime"
    (should= false (prime? 4 [2])))

  (it "checks if a number is prime"
    (should= true (prime? 11 [2 3 5])))

  (it "checks if euler works for 4"
    (should= 5 (euler-10 4)))

  (it "checks if euler works for 5"
    (should= 5 (euler-10 5)))

  (it "checks if euler works 10"
    (should= 17 (euler-10 10)))

  (it "checks if euler works 11"
    (should= 17 (euler-10 11)))

  (it "checks if euler works 12"
    (should= 28 (euler-10 12)))

  (it "checks if sieve works rand"
    (should= 10 (sieve-of-Eratosthenes 6)))

  (it "checks if sieve works 10"
    (should= 17 (sieve-of-Eratosthenes 10)))

  (it "checks if sieve works 2000000"
    (should= 142913828922 (sieve-of-Eratosthenes 2000000)))

  ;(it "checks if euler works 2,000,000"
  ;  (should= 142913828922 (euler-10 2000000)))
  )
