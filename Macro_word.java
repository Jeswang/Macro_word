Sub ͼƬ����()

' ������[img][/img]���ǰ�����[align=center][/align]

    Selection.HomeKey Unit:=wdStory
    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "[img]"
        .Replacement.Text = "[align=center][img]"
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
    Selection.HomeKey Unit:=wdStory
    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "[/img]"
        .Replacement.Text = "[/img][/align]"
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
End Sub

Sub ɾ���հ���()

'ɾ������

    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "^p^p"
        .Replacement.Text = "^p"
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
End Sub



Sub ���׼ӿո�()

'��ÿ�ζ��׼���4����ǿո�

    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "^p"
        .Replacement.Text = "^p    "
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = False
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
End Sub


Sub ����ɾ�ո�()

'ɾ��ÿ�ζ��׵Ŀո�

    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "^p "
        .Replacement.Text = "^p"
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = False
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
End Sub


Sub ɾͼ()

'ɾ��Word�ĵ��е�����ͼƬ

Dim pic As InlineShape
 
 For Each pic In ActiveDocument.InlineShapes
 
 If pic.Width <> 0 Then

pic.Select
 
 Selection.Delete
 
 End If


Next


End Sub


Sub �ֶ�����()

'�����ж������滻Ϊ�ֶ����б��


    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "^p"
        .Replacement.Text = "^l"
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
End Sub
Sub �Զ�����()

'�������ֶ����б���滻Ϊ������

    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "^l"
        .Replacement.Text = "^p"
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
End Sub

Sub ��HTML�ո�()

' ������HTML��ʽ�ո��滻Ϊ��ǿո�

    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = " "
        .Replacement.Text = " "
        .Forward = True
        .Wrap = wdFindAsk
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
    
       
End Sub
Sub �Զ�����ͼ()

'��Word�ĵ��еĿɼ�ͼƬ����Ϊͳһ��С


Dim myis As InlineShape

For Each myis In ActiveDocument.InlineShapes
    
If myis.Width > CentimetersToPoints(2.5) Then
  
      
If myis.Width < CentimetersToPoints(0.5) Then GoTo 10
If myis.Height < CentimetersToPoints(0.5) Then GoTo 10
     
 myis.Reset
     
    ' myis.PictureFormat.ColorType = msoPictureGrayscale

   myis.LockAspectRatio = msoTrue
     
    
   myis.ScaleWidth = 99
    
  If myis.Width > CentimetersToPoints(1) Then myis.Width = CentimetersToPoints(3.5)
    
    myis.ScaleHeight = myis.ScaleWidth
         
      
  End If

10: Next myis
End Sub

Sub ͼ����()

'����Word�ĵ��е����пɼ�ͼƬ

Dim myis As InlineShape

For Each myis In ActiveDocument.InlineShapes
    
  If myis.Width > 0 Then
  
  myis.Select
  
  
  Selection.ParagraphFormat.Alignment = wdAlignParagraphCenter
      
        
  End If

Next myis
End Sub


Sub ��ȫ�ǿո�()

' ������ȫ�ǿո��滻Ϊ��ǿո�

    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "��"
        .Replacement.Text = " "
        .Forward = True
        .Wrap = wdFindAsk
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
End Sub


Sub ���ո�()
 
  ��HTML�ո�
  ��ȫ�ǿո�

End Sub


Sub ����к�()


'��ѡ�е�ÿ������ǰ����1. 2. 3.����


Dim parag As Paragraph
Dim nLineNum: nLineNum = 0
Dim selRge As Range
Set selRge = Selection.Range
  
  For Each parag In Selection.Paragraphs
  nLineNum = nLineNum + 1
  
  
If nLineNum > 0 Then
   selRge.Paragraphs(nLineNum).Range.InsertBefore (nLineNum & ".  ")
 
 End If
  
  
'��λ��ǰ�Զ����0
' If nLineNum < 10 And nLineNum > 0 Then
'    selRge.Paragraphs(nLineNum).Range.InsertBefore ("0" & nLineNum & "   ")
'  Else
'    selRge.Paragraphs(nLineNum).Range.InsertBefore (nLineNum & "   ")
'  End If
  
  
  
 Next

End Sub

Sub �Ӵ�()

'��ѡ�е�����ǰ�����[b][/b]
  
With Selection
    .InsertBefore "[b]"
End With

With Selection
    .InsertAfter "[/b]"
End With


End Sub


Sub ������()

  
  
With Selection
    .InsertBefore "[url]"
End With

With Selection
    .InsertAfter "[/url]"
End With


End Sub

Sub ������2()
  
  
With Selection
    .InsertBefore "[url=]"
End With

With Selection
    .InsertAfter "[/url]"
End With


End Sub

Sub ���ø�ʽ()

'��ѡ�е�����ǰ�����[quote][/quote]
  
With Selection
    .InsertBefore "[quote]"
End With

With Selection
    .InsertAfter "[/quote]"
End With


End Sub


Sub �б��ǩ()

'ѡ��������λ����[list][/list]

With Selection
    .InsertParagraphBefore
End With
  
With Selection
    .InsertBefore "[list]"
End With

With Selection
    .InsertAfter "[/list]"
End With


End Sub

Sub �б�κ�()

'ѡ���������ж���ǰ��[*]

Dim parag As Paragraph
Dim nLineNum: nLineNum = 0
Dim selRge As Range
Set selRge = Selection.Range
  
  For Each parag In Selection.Paragraphs
  nLineNum = nLineNum + 1
  
  If nLineNum > 0 Then
    selRge.Paragraphs(nLineNum).Range.InsertBefore ("[*]")
  End If
  
 Next

End Sub

Sub ���б�()

�б�κ�
�б��ǩ

End Sub


Sub �Զ�����()

'ʶ�����ӣ���ȡURL���������ı�ǰ�����[URL]���

For Each aHyperlink In ActiveDocument.Hyperlinks
        
   If InStr(LCase(aHyperlink.Address), "http") <> 0 Then
        
      aHyperlink.Range.Select
         
    With Selection
      .InsertBefore "[url=" & aHyperlink.Address & "]"
    End With
           
    With Selection
      .InsertAfter "[/url]"
    End With
    
    End If
        
Next aHyperlink


End Sub


Sub �����ʽ()

   Selection.ClearFormatting
       
End Sub
Sub ȥ����()


    Selection.WholeStory
    
    ȥ�������
    ȥ���ֵ���
    
End Sub
Sub ȥ���ֵ���()
    
    
    With Selection.Font
        With .Shading
            .Texture = wdTextureNone
            .ForegroundPatternColor = wdColorAutomatic
            .BackgroundPatternColor = wdColorAutomatic
        End With
        .Borders(1).LineStyle = wdLineStyleNone
        .Borders.Shadow = False
    End With
    With Options
        .DefaultBorderLineStyle = wdLineStyleSingle
        .DefaultBorderLineWidth = wdLineWidth050pt
        .DefaultBorderColor = wdColorAutomatic
    End With
End Sub

Sub ȥ�������()

  
    With Selection.ParagraphFormat
        With .Shading
            .Texture = wdTextureNone
            .ForegroundPatternColor = wdColorAutomatic
            .BackgroundPatternColor = wdColorAutomatic
        End With
        .Borders(wdBorderLeft).LineStyle = wdLineStyleNone
        .Borders(wdBorderRight).LineStyle = wdLineStyleNone
        .Borders(wdBorderTop).LineStyle = wdLineStyleNone
        .Borders(wdBorderBottom).LineStyle = wdLineStyleNone
        .Borders(wdBorderHorizontal).LineStyle = wdLineStyleNone
        With .Borders
            .DistanceFromTop = 1
            .DistanceFromLeft = 4
            .DistanceFromBottom = 1
            .DistanceFromRight = 4
            .Shadow = False
        End With
    End With
    With Options
        .DefaultBorderLineStyle = wdLineStyleSingle
        .DefaultBorderLineWidth = wdLineWidth050pt
        .DefaultBorderColor = wdColorAutomatic
    End With
End Sub


Sub ������ʽ�Ӵ�()


'���������ʽΪָ����ʽ��������λ����[b][/b]

Dim cuti As Paragraph
 
  For Each cuti In ActiveDocument.Paragraphs
  
  If cuti.Style = ActiveDocument.Styles("���� 3") Then
  
  cuti.Range.Select
  
  With Selection
      .InsertBefore "[b]"
    End With
           
    With Selection
      .InsertAfter "[/b]"
    End With

  End If
  
 Next


End Sub

Sub ���ⳤ�ȼӴ�()


' Ҫ���û����ó���ֵ

Dim Message, Title, Default, MyValue

Message = "�������޶��Ķ����ı���/������"

Title = "�޶�����"

Default = "10"

MyValue = InputBox(Message, Title, Default)

' ����������ֳ���С���趨ֵ��������λ����[b][/b]

Dim cuti As Paragraph
 
  For Each cuti In ActiveDocument.Paragraphs
  
      
  If cuti.Range.Words.Count < MyValue And cuti.Range.Words.Count > 1 Then
  
  
'  Range.Characters.Count < 20 Then
       
  cuti.Range.Select
     
  With Selection
      .InsertBefore "[b]"
    End With
        
   Selection.EndKey Unit:=wdLine
   Selection.TypeText Text:="[/b]"
   Selection.MoveRight Unit:=wdCharacter, Count:=1
      
    
   ' With Selection
   '   .InsertAfter "[/b]"
  '  End With

  End If
   
 Next

End Sub
Sub ����Ӵ�()

' ������еļӴֱ��[b][/b]

    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "[b]"
        .Replacement.Text = ""
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
    With Selection.Find
        .Text = "[/b]"
        .Replacement.Text = ""
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
End Sub

Sub �޸��ֶ�()
'
' �����в���ȷ�ķֶα�ǣ��ú�����޸���������
'
    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "^p"
        .Replacement.Text = "aaabbbccc"
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
    With Selection.Find
        .Text = ".aaabbbccc"
        .Replacement.Text = ".^p"
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
    With Selection.Find
        .Text = "aaabbbccc"
        .Replacement.Text = "   "
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
End Sub



Sub ɾ����()



Dim kong As Paragraph
 
  For Each kong In ActiveDocument.Paragraphs
  
      
  If kong.Range.Characters.Count = 1 Then
  
         
  kong.Range.Select
   
  
  Selection.Delete
        
  
  End If
   
 Next

'����ɾ�ո�


End Sub
Sub �������()
'
' ��顰[url=���͡�http://�����Ƿ��пո�����ɾ��
'
'
    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "[url= http://"
        .Replacement.Text = "[url=http://"
        .Forward = True
        .Wrap = wdFindAsk
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
   
    With Selection.Find
        .Text = "[url= https://"
        .Replacement.Text = "[url=https://"
        .Forward = True
        .Wrap = wdFindAsk
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
    
End Sub


Sub ȡ�����г�����()

'������еĳ�����


Dim oField As Field

For Each oField In ActiveDocument.Fields
 If oField.Type = wdFieldHyperlink Then
   oField.Unlink
 End If
   
Next
   Set oField = Nothing
End Sub


Sub ѡ�񲿷��ֶ�����()

'��ѡ�񲿷ֵĶ������滻Ϊ�ֶ����б��

    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "^p"
        .Replacement.Text = "^l"
        .Forward = True
        .Wrap = wdFindAsk
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
End Sub




Sub �ܱ�����()

'Markup�﷨��д�ܱ��ã���ʶ�����ӣ���ȡURL������#

For Each aHyperlink In ActiveDocument.Hyperlinks
        
   If InStr(LCase(aHyperlink.Address), "http") <> 0 Then
        
      aHyperlink.Range.Select
         
    With Selection
      .InsertBefore "#[" & aHyperlink.Address & " "
    End With
           
    With Selection
      .InsertAfter "]"
    End With
    
    End If
        
Next aHyperlink


End Sub


Sub �Ӵ���()
  
  
With Selection
    .InsertBefore "[code=""]"
End With

With Selection
    .InsertAfter "[/code]"
End With


End Sub



Sub �����滻()

'�ѳ�����ȷʵ�����Զ��滻�Ĵ���ֽ����Զ��滻��
'��һ�������Ǵ���֣��ڶ�����������ȷ����


�滻���ô���� "Ωһ", "Ψһ"
�滻���ô���� "�ʺ�", "�˺�"
�滻���ô���� "ͼ��", "ͼ��"
�滻���ô���� "��½", "��¼"
�滻���ô���� "����", "����"
�滻���ô���� "��װ", "��װ"
�滻���ô���� "��Ŧ", "��ť"
�滻���ô���� "�ɷ�", "�ɷ�"
�滻���ô���� "���", "���"
�滻���ô���� "ú��", "ý��"
�滻���ô���� "����", "�洢"
�滻���ô���� "һ��", "һ֡"
�滻���ô���� "����", "����"
�滻���ô���� "����", "����"


End Sub

Sub �滻���ô����(strWrong As String, strRight)

'�˹��̽���������ã���Ҫ���ֹ�ʹ��
'
'
'
    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = strWrong
        .Replacement.Text = strRight
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
End Sub



Sub ���ת��()

'�����ת����bbcode����ʽ

�����
ÿ�μ�����
��β��table


End Sub



Sub �����()

' �����Ϊ�ı�


    Application.DefaultTableSeparator = "|"
    Selection.Rows.ConvertToText Separator:=wdSeparateByDefaultListSeparator, _
        NestedTables:=True
End Sub

Sub ��β��table()

'ѡ��������λ����[table][/table]

With Selection
    .InsertParagraphBefore
End With
  
With Selection
    .InsertBefore "[table]"
End With

With Selection
    .InsertAfter "[/table]"
End With


End Sub


Sub ÿ�μ�����()

'ѡ���������ж���ǰ��|

Dim parag As Paragraph
Dim nLineNum: nLineNum = 0
Dim selRge As Range
Set selRge = Selection.Range
  
  For Each parag In Selection.Paragraphs
  
 
  nLineNum = nLineNum + 1
  
  
  If nLineNum > 0 Then
  

    selRge.Paragraphs(nLineNum).Range.InsertBefore ("|")
        
    Set myrange = selRge.Paragraphs(nLineNum).Range
        
    myrange.End = myrange.End - 1
    
    myrange.InsertAfter ("|")


  End If
  
 Next

End Sub





Sub �μ�ӿ���()

'�ڶ������Ͽ��У�[list]�б�֮�䲻�ӿ���

    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "^p"
        .Replacement.Text = "^p^p"
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
    
    
     Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "^p[*]"
        .Replacement.Text = "[*]"
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
    
    
     
     Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "[/list]^p^p"
        .Replacement.Text = "[/list]^p"
        .Forward = True
        .Wrap = wdFindContinue
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
    
    
    
End Sub



Sub �����ɫ()
  
  
With Selection
    .InsertBefore "[color=red]"
End With

With Selection
    .InsertAfter "[/color]"
End With


End Sub


Sub ѡ���ֶ�����()
'
' ��ѡ�е������ֶ�����
'

    Selection.Find.ClearFormatting
    Selection.Find.Replacement.ClearFormatting
    With Selection.Find
        .Text = "^p"
        .Replacement.Text = "^l"
        .Forward = True
        .Wrap = wdFindAsk
        .Format = False
        .MatchCase = False
        .MatchWholeWord = False
        .MatchByte = True
        .MatchWildcards = False
        .MatchSoundsLike = False
        .MatchAllWordForms = False
    End With
    Selection.Find.Execute Replace:=wdReplaceAll
End Sub




Sub �Զ�����123()

'ʶ�����ӣ���ȡURL���������ı�ǰ�����[URL]���

Dim link

For Each aHyperlink In ActiveDocument.Hyperlinks
        
   If InStr(LCase(aHyperlink.Address), "http") <> 0 Then
        
      aHyperlink.Range.Select
      
      link = aHyperlink.Address
         
     Selection.MoveRight Unit:=wdCell
     
     Selection.TypeText Text:=link

     Selection.MoveRight Unit:=wdCell
    End If
        
Next aHyperlink


End Sub
Sub Macro1()
'
' Macro1 Macro
' ���� 2014-5-23 �� wg ¼��
'
    Selection.MoveRight Unit:=wdCell
    Selection.MoveRight Unit:=wdCell
    Selection.MoveUp Unit:=wdLine, Count:=1
    Selection.MoveRight Unit:=wdCharacter, Count:=10
    Selection.MoveRight Unit:=wdCell
End Sub
Sub Macro2()
'
' Macro2 Macro
' ���� 2014-5-23 �� wg ¼��
'
    Selection.TypeText Text:="123123123"
End Sub


Sub Macro3()
'
' Macro3 Macro
' ���� 2014-7-9 �� wg ¼��
'
    Selection.InlineShapes(1).Fill.Visible = msoFalse
    Selection.InlineShapes(1).Fill.Solid
    Selection.InlineShapes(1).Fill.Transparency = 0#
    Selection.InlineShapes(1).Line.Weight = 0.75
    Selection.InlineShapes(1).Line.Transparency = 0#
    Selection.InlineShapes(1).Line.Visible = msoFalse
    Selection.InlineShapes(1).LockAspectRatio = msoTrue
    Selection.InlineShapes(1).Height = 133.8
   
    Selection.InlineShapes(1).PictureFormat.Brightness = 0.5
    Selection.InlineShapes(1).PictureFormat.Contrast = 0.5
    Selection.InlineShapes(1).PictureFormat.ColorType = msoPictureAutomatic
    Selection.InlineShapes(1).PictureFormat.CropLeft = 56.41
    Selection.InlineShapes(1).PictureFormat.CropRight = 33.45
    Selection.InlineShapes(1).PictureFormat.CropTop = 34.87
    Selection.InlineShapes(1).PictureFormat.CropBottom = 22.68
End Sub




Sub ����ͼƬ��С()


Dim pic As InlineShape

Dim n
 
 For Each pic In ActiveDocument.InlineShapes
 
 If pic.Width <> 0 Then

    pic.Select
       
 Selection.InlineShapes(1).LockAspectRatio = msoTrue
  
 
   pic.Width = 99.2
    

n = pic.ScaleWidth

      
pic.ScaleHeight = n

pic.ScaleWidth = n

      

 
 End If


Next


End Sub
Sub Macro4()
'
' Macro4 Macro
' ���� 2014-7-9 �� wg ¼��
'
    Selection.InlineShapes(1).Fill.Visible = msoFalse
    Selection.InlineShapes(1).Fill.Solid
    Selection.InlineShapes(1).Fill.Transparency = 0#
    Selection.InlineShapes(1).Line.Weight = 0.75
    Selection.InlineShapes(1).Line.Transparency = 0#
    Selection.InlineShapes(1).Line.Visible = msoFalse
    Selection.InlineShapes(1).Width = 99.2
    Selection.InlineShapes(1).PictureFormat.Brightness = 0.5
    Selection.InlineShapes(1).PictureFormat.Contrast = 0.5
    Selection.InlineShapes(1).PictureFormat.ColorType = msoPictureAutomatic
    Selection.InlineShapes(1).PictureFormat.CropLeft = 56.41
    Selection.InlineShapes(1).PictureFormat.CropRight = 33.45
    Selection.InlineShapes(1).PictureFormat.CropTop = 34.87
    Selection.InlineShapes(1).PictureFormat.CropBottom = 22.68
End Sub
