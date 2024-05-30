namespace チェックボックスの使い方
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
            checkBox_Select = new CheckBox();
            label_Display = new Label();
            button_Display = new Button();
            groupBox1 = new GroupBox();
            groupBox1.SuspendLayout();
            SuspendLayout();
            // 
            // checkBox_Select
            // 
            checkBox_Select.AutoSize = true;
            checkBox_Select.Location = new Point(6, 26);
            checkBox_Select.Name = "checkBox_Select";
            checkBox_Select.Size = new Size(95, 24);
            checkBox_Select.TabIndex = 0;
            checkBox_Select.Text = "表示選択";
            checkBox_Select.UseVisualStyleBackColor = true;
            // 
            // label_Display
            // 
            label_Display.BorderStyle = BorderStyle.FixedSingle;
            label_Display.Location = new Point(500, 116);
            label_Display.Name = "label_Display";
            label_Display.Size = new Size(156, 25);
            label_Display.TabIndex = 1;
            // 
            // button_Display
            // 
            button_Display.Location = new Point(500, 230);
            button_Display.Name = "button_Display";
            button_Display.Size = new Size(94, 29);
            button_Display.TabIndex = 2;
            button_Display.Text = "表示";
            button_Display.UseVisualStyleBackColor = true;
            button_Display.Click += button_Display_Click;
            // 
            // groupBox1
            // 
            groupBox1.Controls.Add(checkBox_Select);
            groupBox1.Location = new Point(64, 116);
            groupBox1.Name = "groupBox1";
            groupBox1.Size = new Size(250, 125);
            groupBox1.TabIndex = 3;
            groupBox1.TabStop = false;
            groupBox1.Text = "groupBox1";
            // 
            // Form_Main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(groupBox1);
            Controls.Add(button_Display);
            Controls.Add(label_Display);
            Name = "Form_Main";
            Text = "Form1";
            groupBox1.ResumeLayout(false);
            groupBox1.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private CheckBox checkBox_Select;
        private Label label_Display;
        private Button button_Display;
        private GroupBox groupBox1;
    }
}
