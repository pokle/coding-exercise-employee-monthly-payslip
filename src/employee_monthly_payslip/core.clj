(ns employee-monthly-payslip.core
  (:gen-class))

(defn round
  "Rounds numbers to longs, using a half up algorithm for tax purposes"
  [num]
  (long (+ num (if (< 0 num) +0.5 -0.5))))

(defn- count-dollars-over
  "Counts the number of dollars over a limit"
  [limit amount]
  (/ (- amount limit) 100))

(defn tax
  "Calculate the tax based on ATO tax rates"
  [taxable-income]

  (round  (cond
           (< taxable-income 1820000) 0
           (< taxable-income 3700000) (* 19 (count-dollars-over 1820000 taxable-income))
           :else :not-implemented-yet
           )))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
