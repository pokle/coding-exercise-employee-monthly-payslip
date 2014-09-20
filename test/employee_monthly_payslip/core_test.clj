(ns employee-monthly-payslip.core-test
  (:require [midje.sweet :refer :all]
            [employee-monthly-payslip.core :refer :all]))

(fact "Tax rates as specified by the ATO"

      (tax -1)         => 0
      (tax 0)          => 0
      (tax 1820000)    => 0
      (tax 1820100)    => 19
      
      )
