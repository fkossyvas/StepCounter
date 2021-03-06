B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private MySteps As Int = 0
	Private LblSteps As Label
	Private LblClock As Label
	Dim T1 As Timer
	Dim Awake1 As PhoneWakeState
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	UpdateSteps
	T1.Initialize("T1",DateTime.TicksPerSecond)
	DateTime.TimeFormat="HH:mm"
	T1.Enabled=True
	Awake1.KeepAlive(False)
End Sub

Private Sub B4XPage_Background
	Awake1.ReleaseKeepAlive
	T1.Enabled=False
End Sub

Private Sub B4XPage_Foreground
	Awake1.KeepAlive(False)
	T1.Enabled=True
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub BtnReset_Click
	MySteps=0
	UpdateSteps
End Sub

Private Sub BtnAdd_Click
	MySteps=MySteps+1
	UpdateSteps
End Sub

Private Sub UpdateSteps
	LblSteps.Text=MySteps
End Sub

Sub T1_Tick
	UpdateLblClock
End Sub

Sub UpdateLblClock
	LblClock.Text=DateTime.Time(DateTime.Now)
End Sub