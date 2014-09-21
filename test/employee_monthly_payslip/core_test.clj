(ns employee-monthly-payslip.core-test
  (:require [midje.sweet :refer :all]
            [employee-monthly-payslip.core :refer :all]))

(fact "Tax rates as specified by the ATO"

      (tax -1)         => 0
      (tax 0)          => 0
      (tax 1820000)    => 0
      (tax 1820001)    => 0
      (tax 1820100)    => 19
      )

(tabular 

 (fact "Tax is rounded using a half up algorithm"
       (round ?argument) => ?expected)
 
 ?argument ?expected
 +5.5      +6
 +2.5      +3
 +1.6      +2
 +1.1      +1
 +1.0      +1
 -1.0      -1
 -1.1      -1
 -1.6      -2
 -2.5      -3
 -5.5      -6
 
  )
      
