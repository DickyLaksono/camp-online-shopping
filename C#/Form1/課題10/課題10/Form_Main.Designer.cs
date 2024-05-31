namespace 課題10
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            textBox = new TextBox();
            button_Read = new Button();
            button_Write = new Button();
            button_Quit = new Button();
            openFileDialog = new OpenFileDialog();
            saveFileDialog = new SaveFileDialog();
            SuspendLayout();
            // 
            // textBox
            // 
            textBox.BackColor = SystemColors.HighlightText;
            textBox.Location = new Point(165, 12);
            textBox.Multiline = true;
            textBox.Name = "textBox";
            textBox.Size = new Size(385, 289);
            textBox.TabIndex = 0;
            // 
            // button_Read
            // 
            button_Read.Location = new Point(165, 336);
            button_Read.Name = "button_Read";
            button_Read.Size = new Size(94, 29);
            button_Read.TabIndex = 1;
            button_Read.Text = "読み込み";
            button_Read.UseVisualStyleBackColor = true;
            button_Read.Click += button_Read_Click;
            // 
            // button_Write
            // 
            button_Write.Location = new Point(317, 336);
            button_Write.Name = "button_Write";
            button_Write.Size = new Size(94, 29);
            button_Write.TabIndex = 2;
            button_Write.Text = "書か込み";
            button_Write.UseVisualStyleBackColor = true;
            button_Write.Click += button_Write_Click;
            // 
            // button_Quit
            // 
            button_Quit.Location = new Point(456, 336);
            button_Quit.Name = "button_Quit";
            button_Quit.Size = new Size(94, 29);
            button_Quit.TabIndex = 3;
            button_Quit.Text = "終了";
            button_Quit.UseVisualStyleBackColor = true;
            button_Quit.Click += button_Quit_Click;
            // 
            // openFileDialog
            // 
            openFileDialog.FileName = "openFileDialog1";
            openFileDialog.FileOk += openFileDialog_FileOk;
            // 
            // saveFileDialog
            // 
            saveFileDialog.FileOk += saveFileDialog_FileOk;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button_Quit);
            Controls.Add(button_Write);
            Controls.Add(button_Read);
            Controls.Add(textBox);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private TextBox textBox;
        private Button button_Read;
        private Button button_Write;
        private Button button_Quit;
        private OpenFileDialog openFileDialog;
        private SaveFileDialog saveFileDialog;
    }
}
