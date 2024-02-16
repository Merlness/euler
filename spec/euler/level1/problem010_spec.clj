(ns euler.level1.problem010-spec
  (:require
    [speclj.core :refer :all]
    [clojure.test :refer :all]
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

  (it "checks if euler works 10"
    (should= 17 (euler-10 10)))

  (it "checks if euler works 12"
    (should= 28 (euler-10 12)))

  (it "checks if sieve works rand"
    (should= 10 (euler-10 6)))

  (it "checks if sieve works 10"
    (should= 17 (euler-10 10)))

  (it "checks square plus empty"
    (should= (set '()) (square-plus 3 8)))

  (it "checks square plus 2 to 6"
    (should= (set '(4)) (square-plus 2 6)))

  (it "checks square plus 3 to 9"
    (should= (set '()) (square-plus 3 9)))

  (it "products from  empty"
    (should= (set '(6)) (products-list-from 3 8)))

  (it "products from 2 to 6"
    (should= (set '(4)) (products-list-from 2 6)))

  (it "products from 3 to 9"
    (should= (set '(6)) (products-list-from 3 9)))

  (it "checks if sieve works 2000000"
    (should= 142913828922 (euler-10 2000000)))

  )
