(ns clojure-playground.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


;comment
(foo ())
[1 2 3]                                                      ; vector
'(1 2 3)                                                     ; linked list
#{:1 :2 :3}                                                  ; set
{:1 "one" :2 "two" :3 "three"}                               ; dictionary