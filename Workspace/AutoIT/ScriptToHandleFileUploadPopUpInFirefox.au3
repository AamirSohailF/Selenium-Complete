Local $sTitle = "File Upload"
WinWaitActive($sTitle)
Sleep(3000)
ControlSend($sTitle,"", "Edit1","C:\Users\aamir\Downloads\seleniumResume.pdf")
ControlClick($sTitle,"", 1)