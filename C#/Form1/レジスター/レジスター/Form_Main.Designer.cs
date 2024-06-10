namespace レジスター
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
            listBox_Item = new ListBox();
            label_Total = new Label();
            label2 = new Label();
            button_Display = new Button();
            SuspendLayout();
            // 
            // listBox_Item
            // 
            listBox_Item.FormattingEnabled = true;
            listBox_Item.Items.AddRange(new object[] { "98", "1250", "530", "350", "1550", "3450" });
            listBox_Item.Location = new Point(71, 53);
            listBox_Item.Name = "listBox_Item";
            listBox_Item.Size = new Size(150, 184);
            listBox_Item.TabIndex = 0;
            // 
            // label_Total
            // 
            label_Total.AutoSize = true;
            label_Total.Location = new Point(411, 88);
            label_Total.Name = "label_Total";
            label_Total.Size = new Size(41, 20);
            label_Total.TabIndex = 1;
            label_Total.Text = "合計";
            // 
            // label2
            // 
            label2.BorderStyle = BorderStyle.Fixed3D;
            label2.Location = new Point(411, 138);
            label2.Name = "label2";
            label2.Size = new Size(126, 25);
            label2.TabIndex = 2;
            // 
            // button_Display
            // 
            button_Display.Location = new Point(411, 208);
            button_Display.Name = "button_Display";
            button_Display.Size = new Size(94, 29);
            button_Display.TabIndex = 3;
            button_Display.Text = "表示";
            button_Display.UseVisualStyleBackColor = true;
            button_Display.Click += button_Display_Click;
            // 
            // Form_Main
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(button_Display);
            Controls.Add(label2);
            Controls.Add(label_Total);
            Controls.Add(listBox_Item);
            Name = "Form_Main";
            Text = "レジスター";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private ListBox listBox_Item;
        private Label label_Total;
        private Label label2;
        private Button button_Display;
    }
}
