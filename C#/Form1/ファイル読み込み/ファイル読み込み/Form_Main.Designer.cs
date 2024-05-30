namespace ファイル読み込み
{
    partial class Form_Main
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
            openFileDialog = new OpenFileDialog();
            button_Read = new Button();
            button_Write = new Button();
            saveFileDialog = new SaveFileDialog();
            SuspendLayout();
            // 
            // openFileDialog
            // 
            openFileDialog.FileOk += openFileDialog_FileOk;
            // 
            // button_Read
            // 
            button_Read.Location = new Point(147, 132);
            button_Read.Name = "button_Read";
            button_Read.Size = new Size(94, 29);
            button_Read.TabIndex = 0;
            button_Read.Text = "読み込み";
            button_Read.UseVisualStyleBackColor = true;
            button_Read.Click += button_Read_Click;
            // 
            // button_Write
            // 
            button_Write.Location = new Point(608, 132);
            button_Write.Name = "button_Write";
            button_Write.Size = new Size(94, 29);
            button_Write.TabIndex = 1;
            button_Write.Text = "書き込み";
            button_Write.UseVisualStyleBackColor = true;
            button_Write.Click += button_Write_Click;
            // 
            // saveFileDialog
            // 
            saveFileDialog.FileOk += saveFileDialog_FileOk;
            // 
            // Form_Main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button_Write);
            Controls.Add(button_Read);
            Name = "Form_Main";
            ResumeLayout(false);
        }

        #endregion

        private OpenFileDialog openFileDialog;
        private Button button_Read;
        private Button button_Write;
        private SaveFileDialog saveFileDialog;
    }
}
