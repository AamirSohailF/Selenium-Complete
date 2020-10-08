Local $sTitle="Open"
WinWaitActive($sTitle)
Sleep(3000)
ControlSend($sTitle,"","Edit1","D:\Selenium_Resume.doc")
ControlClick($sTitle,"",1)