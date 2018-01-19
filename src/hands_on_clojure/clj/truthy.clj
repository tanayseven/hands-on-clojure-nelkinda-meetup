; Check if the value is truthy or not
(defn truthy?
  [value]
  (do
    (if value true false)))












(truthy? "This is a string")











(truthy? "") ; An empty string








(not (empty? "")) ; Ah, this works










(truthy? nil)










(truthy? 0)













(not (zero? 0)) ; Ok, this is the way to do it






