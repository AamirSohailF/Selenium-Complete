Local $sTitle='Untitled - Notepad'
Run("notepad.exe")
WinWaitActive($sTitle)

WinSetState($sTitle,"", @SW_MAXIMIZE)

ControlSend($sTitle,"", 15, "Automation From AutoIT SoftWare")

WinClose($sTitle)

Local $sDecisionTitle='Notepad'
Local $sDontSaveButtonText="Do&n't Save"
WinWaitActive($sDecisionTitle,$sDontSaveButtonText)

ControlClick($sDecisionTitle,$sDontSaveButtonText,"Button2")