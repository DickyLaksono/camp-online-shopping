namespace 課題10
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
            button_Read = new Button();
            button_Write = new Button();
            button_Exit = new Button();
            openFileDialog1 = new OpenFileDialog();
            SuspendLayout();
            // 
            // button_Read
            // 
            button_Read.Location = new Point(12, 59);
            button_Read.Name = "button_Read";
            button_Read.Size = new Size(157, 29);
            button_Read.TabIndex = 0;
            button_Read.Text = "名前データ読み込み";
            button_Read.UseVisualStyleBackColor = true;
            button_Read.Click += button_Read_Click;
            // 
            // button_Write
            // 
            button_Write.Location = new Point(217, 59);
            button_Write.Name = "button_Write";
            button_Write.Size = new Size(117, 29);
            button_Write.TabIndex = 1;
            button_Write.Text = "DBへ書き出し";
            button_Write.UseVisualStyleBackColor = true;
            button_Write.Click += button_Write_Click;
            // 
            // button_Exit
            // 
            button_Exit.Location = new Point(384, 59);
            button_Exit.Name = "button_Exit";
            button_Exit.Size = new Size(94, 29);
            button_Exit.TabIndex = 2;
            button_Exit.Text = "終了";
            button_Exit.UseVisualStyleBackColor = true;
            button_Exit.Click += button_Exit_Click;
            // 
            // openFileDialog1
            // 
            openFileDialog1.Filter = "CSVファイル|*.csv";
            // 
            // Form_Main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(534, 147);
            Controls.Add(button_Exit);
            Controls.Add(button_Write);
            Controls.Add(button_Read);
            FormBorderStyle = FormBorderStyle.Fixed3D;
            Name = "Form_Main";
            FormClosing += Form_Main_FormClosing;
            ResumeLayout(false);
        }

        #endregion

        private Button button_Read;
        private Button button_Write;
        private Button button_Exit;
        private OpenFileDialog openFileDialog1;
    }
}
