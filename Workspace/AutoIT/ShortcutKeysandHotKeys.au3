Local $sTitle='Untitled - Notepad'
Run("notepad.exe")
WinWaitActive($sTitle)

;Send("+hello From BTM Qspiders Bangalore, Karnatka - India")

Send(20000)

Send("{+}");SHIFT
Send("{!}");ALT
Send("{#}");WINDOWS KEY
Send("{^}");CONTROL

;Send("#r")

#cs
Send("{ENTER}MOHAN")
Send("{BACKSPACE}")

Send("^a")
#ce
;Send("^a")
;Send("{TAB 3}")
;Send("{s 10}")

Send("+{TAB 4}")