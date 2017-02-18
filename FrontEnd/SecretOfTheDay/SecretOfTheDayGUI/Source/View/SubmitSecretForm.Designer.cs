namespace SecretOfTheDayGUI
{
    partial class SubmitSecretForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
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
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.SecretCommentField = new System.Windows.Forms.RichTextBox();
            this.openFileDialog1 = new System.Windows.Forms.OpenFileDialog();
            this.pictureUrlField = new System.Windows.Forms.TextBox();
            this.SubmitSecretButton = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(128, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(254, 31);
            this.label1.TabIndex = 0;
            this.label1.Text = "Submit new secret";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(12, 82);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(138, 24);
            this.label2.TabIndex = 1;
            this.label2.Text = "Upload Picture:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(12, 127);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(97, 24);
            this.label3.TabIndex = 2;
            this.label3.Text = "Comment:";
            // 
            // SecretCommentField
            // 
            this.SecretCommentField.AcceptsTab = true;
            this.SecretCommentField.Location = new System.Drawing.Point(12, 167);
            this.SecretCommentField.Name = "SecretCommentField";
            this.SecretCommentField.ScrollBars = System.Windows.Forms.RichTextBoxScrollBars.Vertical;
            this.SecretCommentField.Size = new System.Drawing.Size(448, 254);
            this.SecretCommentField.TabIndex = 3;
            this.SecretCommentField.Text = "";
            // 
            // openFileDialog1
            // 
            this.openFileDialog1.FileName = "openSecret";
            // 
            // pictureUrlField
            // 
            this.pictureUrlField.Location = new System.Drawing.Point(166, 86);
            this.pictureUrlField.Name = "pictureUrlField";
            this.pictureUrlField.Size = new System.Drawing.Size(294, 20);
            this.pictureUrlField.TabIndex = 4;
            this.pictureUrlField.Click += new System.EventHandler(this.OpenFileDialog);
            // 
            // SubmitSecretButton
            // 
            this.SubmitSecretButton.AutoSize = true;
            this.SubmitSecretButton.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.SubmitSecretButton.Location = new System.Drawing.Point(382, 427);
            this.SubmitSecretButton.Name = "SubmitSecretButton";
            this.SubmitSecretButton.Size = new System.Drawing.Size(78, 34);
            this.SubmitSecretButton.TabIndex = 5;
            this.SubmitSecretButton.Text = "Submit";
            this.SubmitSecretButton.UseVisualStyleBackColor = true;
            this.SubmitSecretButton.Click += new System.EventHandler(this.SubmitSecretButton_Click);
            // 
            // SubmitSecretForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(474, 476);
            this.Controls.Add(this.SubmitSecretButton);
            this.Controls.Add(this.pictureUrlField);
            this.Controls.Add(this.SecretCommentField);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.MaximizeBox = false;
            this.MaximumSize = new System.Drawing.Size(490, 515);
            this.MinimumSize = new System.Drawing.Size(490, 515);
            this.Name = "SubmitSecretForm";
            this.ShowIcon = false;
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Submit New Secret";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.RichTextBox SecretCommentField;
        private System.Windows.Forms.OpenFileDialog openFileDialog1;
        private System.Windows.Forms.TextBox pictureUrlField;
        private System.Windows.Forms.Button SubmitSecretButton;
    }
}