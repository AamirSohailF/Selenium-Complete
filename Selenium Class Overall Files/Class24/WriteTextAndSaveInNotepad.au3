Local $sTitle='Untitled - Notepad'
Run("notepad.exe")
WinWaitActive($sTitle)

WinSetState($sTitle,"", @SW_MAXIMIZE)

;ControlSend($sTitle,"", 15, "Hello From BTM Qspiders Bangalore, Karnatka - India")
Send("Hello From BTM Qspiders Bangalore, Karnatka - India")

WinMenuSelectItem($sTitle,"","&File","&Save")

Local $sSaveAs='Save As'
WinWaitActive($sSaveAs)

ControlSend($sSaveAs,"",1001,"mohan")
ControlClick($sSaveAs,"&Save",1)

WinClose($sTitle)


