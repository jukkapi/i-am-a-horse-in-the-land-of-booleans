(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (if x true false)
  )

(defn abs [x] (if (< x 0) (- x) x)
  )

(defn divides? [divisor n] (if (> (mod n divisor) 0) false true)
  )

(defn fizzbuzz [n] (cond (divides? 15 n) "gotcha!"
                         (divides? 3 n) "fizz"
                         (divides? 5 n) "buzz" 
                         :else "")
  )

(defn teen? [age] (< 12 age 20)
  )

(defn not-teen? [age] (not (teen? age)
                           ))

(defn generic-doublificate [x] (cond (number? x) (* x 2)
                                     (empty? x) nil
                                     (list? x) (* 2 (count x))
                                     (vector? x) (* 2 (count x))
                                     :else true
                                     )
  )

(defn leap-year? [year] (cond (divides? 4 year) (cond (divides? 400 year) true
                                                      (divides? 100 year) false
                                                      :else true)
                              :else false)
  )

; '_______'
